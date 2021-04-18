SUMMARY = "RubyGem: faraday-net_http_persistent"
DESCRIPTION = "Faraday adapter for NetHttpPersistent"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http_persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-net-http-persistent"

SRC_URI[md5sum] = "f8df2adc81c0ec1884b5411cde3b9f30"
SRC_URI[sha256sum] = "8844a8c344658327401f5635da833908b9f5f484c7040d751ffc325bf6783331"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
