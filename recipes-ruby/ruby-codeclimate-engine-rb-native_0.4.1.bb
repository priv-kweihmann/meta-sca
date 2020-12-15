SUMMARY = "JSON issue formatter for the Code Climate engine"
HOMEPAGE = "https://github.com/andyw8/codeclimate-engine-rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56b47d379805ed45bc0c1aff19d7364b"

DEPENDS += "ruby-virtus-native"

SRC_URI[md5sum] = "050479d0b1bc1ca9f7349d9307f0e03f"
SRC_URI[sha256sum] = "ae72b9dfe246d3cd3592cec0f98a9dab06ba655adbb66a51559ca0f3cee0a56c"

GEM_NAME = "codeclimate-engine-rb"

inherit rubygems
inherit native
