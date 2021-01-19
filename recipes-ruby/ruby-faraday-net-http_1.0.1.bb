SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "73db9270982cb4a0d5c0cc9de07d8a51"
SRC_URI[sha256sum] = "3245ce406ebb77b40e17a77bfa66191dda04be2fd4e13a78d8a4305854d328ba"

GEM_NAME = "faraday-net_http"

inherit rubygems
