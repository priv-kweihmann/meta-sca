SUMMARY = "RubyGem: os"
DESCRIPTION = "The OS gem allows for some useful and easy functions, like OS.windows? (=> true or false) OS.bits ( => 32 or 64) etc"
HOMEPAGE = "http://github.com/rdp/os"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aa851a3e1acb73dc5b21ac9fd29ee6f7"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3108fb5bb99cacc0b07f39e5f4e996fd"
SRC_URI[sha256sum] = "3db1fbc14ab8ea99b69ed8e353c894613e1b35e665fffb90414996cf8989d489"

GEM_NAME = "os"

inherit rubygems
