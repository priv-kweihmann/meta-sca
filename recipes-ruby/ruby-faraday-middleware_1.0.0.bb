SUMMARY = "RubyGem: faraday_middleware"
DESCRIPTION = "Various middleware for Faraday"
HOMEPAGE = "https://github.com/lostisland/faraday_middleware"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a59d0c4589d25cc5037028f3465378d6"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-faraday"

SRC_URI[md5sum] = "3fe1c76b1a7ad0a0b38ca0a7e4b74a93"
SRC_URI[sha256sum] = "19e808539681bbf2e65df30dfbe27bb402bde916a1dceb4c7496dbe8de14334a"

GEM_NAME = "faraday_middleware"

inherit rubygems
