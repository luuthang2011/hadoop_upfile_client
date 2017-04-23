/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import constants.ClientConstants;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

/**
 * @author magic_000
 */
public class FileUploadUtils {

    public static FileSystem getFileSystemFromConfig(String url, int port) {
        String hdfsUrl = ClientConstants.HDFS_FREFIX_URL + url + ":" + port;
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", hdfsUrl);
        try {
            FileSystem fs = FileSystem.get(conf);
            return fs;
        } catch (IOException ioe) {
            //ioe.printStackTrace();
            return null;
        }
    }


}