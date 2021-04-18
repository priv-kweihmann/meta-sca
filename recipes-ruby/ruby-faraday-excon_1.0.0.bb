SUMMARY = "RubyGem: faraday-excon"
DESCRIPTION = "Faraday adapter for Excon"
HOMEPAGE = "https://github.com/lostisland/faraday-excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-excon"

SRC_URI[md5sum] = "5ed5b512d2ee9da451dd02a58be52a69"
SRC_URI[sha256sum] = "0594549fb0a158d4a49a45794ba0d1a2a63181b9ffcc7b084f30f143ef2e6882"

GEM_NAME = "faraday-excon"

inherit rubygems
