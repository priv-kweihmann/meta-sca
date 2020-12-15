SUMMARY = "RubyGem: timeliness"
DESCRIPTION = "Fast date/time parser with customisable formats, timezone and I18n support."
HOMEPAGE = "http://github.com/adzap/timeliness"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ce16f13890f3a9c71978b98149ef2e1c"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "fa1edcfde69ce145897bfa8168890bea"
SRC_URI[sha256sum] = "d5d96805f3aed57fb756dba0ee75f3fee8db57e1e55dc565690ef0fbd2cb6bbf"

GEM_NAME = "timeliness"

inherit rubygems
