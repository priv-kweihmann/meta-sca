SUMMARY = "RubyGem: coderay"
DESCRIPTION = "Fast and easy syntax highlighting for selected languages, written in Ruby"
HOMEPAGE = "http://coderay.rubychan.de"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=f622e70ffef94aded92d4aa72c2001b2"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b726a821d66a6a46cc43c5534b079d8e"
SRC_URI[sha256sum] = "dc530018a4684512f8f38143cd2a096c9f02a1fc2459edcfe534787a7fc77d4b"

GEM_NAME = "coderay"

inherit rubygems
