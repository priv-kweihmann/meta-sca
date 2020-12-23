SUMMARY = "RubyGem: json"
DESCRIPTION = "This is a JSON implementation as a Ruby extension in C."
HOMEPAGE = "http://flori.github.io/json/"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a960b08d972f43f91ae84a6f00dcbfb"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2353b46df85e0759d5c752aa05cac61d"
SRC_URI[sha256sum] = "918d8c41dacb7cfdbe0c7bbd6014a5372f0cf1c454ca150e9f4010fe80cc3153"

GEM_NAME = "json"

inherit rubygems
