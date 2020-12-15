SUMMARY = "RubyGem: gyoku"
DESCRIPTION = "Gyoku translates Ruby Hashes to XML"
HOMEPAGE = "https://github.com/savonrb/gyoku"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=02933c5230585b35a44f9d13993f7a84"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-builder"

SRC_URI[md5sum] = "7af7a2b4fac7bf7ec15eff1026b1495d"
SRC_URI[sha256sum] = "b0c5c825718df093437ab6bf84a25f39711816ab52a3bb3d2dcfa44102d5c0f2"

GEM_NAME = "gyoku"

inherit rubygems
