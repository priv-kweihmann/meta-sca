SUMMARY = "RubyGem: net-scp"
DESCRIPTION = "A pure Ruby implementation of the SCP client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-scp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-net-ssh"

SRC_URI[md5sum] = "8d8be5990e79db726252a3e8075c9543"
SRC_URI[sha256sum] = "8fc6c80365b95230c6bfc529dbea3893d2d81724855bfb01cbf385866e1c902c"

GEM_NAME = "net-scp"

inherit rubygems
