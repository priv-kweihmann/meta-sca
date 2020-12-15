SUMMARY = "RubyGem: tomlrb"
DESCRIPTION = "A racc based toml parser"
HOMEPAGE = "https://github.com/fbernier/tomlrb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=856e05d07fd1d066ea36fe4f682920f3"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2240436f6b8959b1abbafe9de5958426"
SRC_URI[sha256sum] = "591f417b4f9f6ac7db46a390ff7bfd3e0755b8ad34ab201c385b47b599dc5e6b"

GEM_NAME = "tomlrb"

inherit rubygems
