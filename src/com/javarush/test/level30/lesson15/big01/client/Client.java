package com.javarush.test.level30.lesson15.big01.client;

import com.javarush.test.level30.lesson15.big01.Connection;
import com.javarush.test.level30.lesson15.big01.ConsoleHelper;
import com.javarush.test.level30.lesson15.big01.Message;
import com.javarush.test.level30.lesson15.big01.MessageType;

import java.io.IOException;

public class Client {

    protected Connection connection;
    private volatile boolean clientConnected = false;


    /** Methods **/
    /** ������ ��������� ���� ������ ������� � ������� ��������� ��������**/
    protected String getServerAddress() {

        ConsoleHelper.writeMessage("������� ����� �������: ");
        return ConsoleHelper.readString();
    }


    /** ������ ����������� ���� ����� ������� � ���������� ��� **/
    protected int getServerPort() {

        ConsoleHelper.writeMessage("������� ���� �������: ");
        return ConsoleHelper.readInt();
    }


    /** ������ ����������� � ���������� ��� ������������ **/
    protected String getUserName() {

        ConsoleHelper.writeMessage("������� ��� ������������: ");
        return ConsoleHelper.readString();
    }


    protected boolean shouldSentTextFromConsole() {

        return true;
    }


    /** ������ ��������� � ���������� ����� ������ ������ SocketThread **/
    protected SocketThread getSocketThread() {

        return new SocketThread();
    }


    /**  ������� ����� ��������� ���������, ��������� ���������� ����� � ���������� ��� ������� ����� ���������� connection **/
    protected void sendTextMessage(String text) {

        try {
            connection.send(new Message(MessageType.TEXT, text));

        } catch (IOException e) {
            ConsoleHelper.writeMessage("������ ��������");
            clientConnected = false;
        }

    }


    /** SocketThread **/
    public class SocketThread extends Thread {

    }

}