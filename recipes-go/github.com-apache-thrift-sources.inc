SRC_URI += "https://proxy.golang.org/github.com/apache/thrift/@v/v0.15.0.zip;srcoutput=github.com/apache/thrift;srcinput=github.com/apache/thrift@v0.15.0;downloadfilename=github-com-apache-thrift-0.15.0.zip;name=github-com-apache-thrift"
SRC_URI[github-com-apache-thrift.sha256sum] = "f9e5418fda5dff9f5e1a892a127472fc621d417b3ee1351e53141509233fb1d5"
GOSRC_REMOVEDIRS += "github.com/apache/thrift/tutorial"
GOSRC_REMOVEDIRS += "github.com/apache/thrift/test"
GOSRC_REMOVEDIRS += "github.com/apache/thrift/lib/go/test/tests"
GOSRC_REMOVEDIRS += "github.com/apache/thrift/test/go/src/bin/testclient"
GOSRC_REMOVEDIRS += "github.com/apache/thrift/test/go/src/bin/stress"
GOSRC_REMOVEDIRS += "github.com/apache/thrift/lib/go/test"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    FSFAP \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/apache/thrift/LICENSE;md5=c40a383cb3f747e0c7abbf1482f194f0 \
    file://src/github.com/apache/thrift/contrib/fb303/LICENSE;md5=2bb738113ce26a7910645e5790af76a5 \
    file://src/github.com/apache/thrift/doc/licenses/otp-base-license.txt;md5=7eb1bd181118ec910ac57a02f5f44a88 \
    file://src/github.com/apache/thrift/lib/dart/LICENSE;md5=2bb738113ce26a7910645e5790af76a5 \
"

GOSRC_INCLUDEGUARD += "github.com-apache-thrift-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-mock-sources.inc', '', 'github.com-golang-mock-sources.inc', d)}
