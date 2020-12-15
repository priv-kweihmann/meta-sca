SUMMARY = "RubyGem: net-ssh"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-ssh"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "383afadb1bd66a458a5d8d2d60736b3d"
SRC_URI[sha256sum] = "8905c1f9209fb216c59cc631c2e4085b1a9660598da6de0f20323264d993e34a"

GEM_NAME = "net-ssh"

inherit rubygems
