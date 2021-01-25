SUMMARY = "RubyGem: ast"
DESCRIPTION = "A library for working with Abstract Syntax Trees."
HOMEPAGE = "https://whitequark.github.io/ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=b46ff44655f29020fc7542adda3ad781"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "f34e4eebd2f1d443a90a2aff11a08c73"
SRC_URI[sha256sum] = "1e280232e6a33754cde542bc5ef85520b74db2aac73ec14acef453784447cc12"

GEM_NAME = "ast"

inherit rubygems
inherit native
