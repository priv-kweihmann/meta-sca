SUMMARY = "RubyGem: tomlrb"
DESCRIPTION = "A racc based toml parser"
HOMEPAGE = "https://github.com/fbernier/tomlrb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=856e05d07fd1d066ea36fe4f682920f3"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "c3c1d4369ce652bc942038c675eabb7c"
SRC_URI[sha256sum] = "4fcc546118fa73a556f2d8d9a4a121fa0cfc7a99d990168ac9f4fbdbcb620329"

GEM_NAME = "tomlrb"

inherit rubygems
