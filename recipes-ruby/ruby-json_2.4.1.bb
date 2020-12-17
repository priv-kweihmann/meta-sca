SUMMARY = "RubyGem: json"
DESCRIPTION = "This is a JSON implementation as a Ruby extension in C."
HOMEPAGE = "http://flori.github.io/json/"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a960b08d972f43f91ae84a6f00dcbfb"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "4315638d24c214f8ab0502e9e0201403"
SRC_URI[sha256sum] = "f8d2ead1568e59de3d44dc4bfca9f4a93c8b73818ad7df986025fa9de2edf627"

GEM_NAME = "json"

inherit rubygems
