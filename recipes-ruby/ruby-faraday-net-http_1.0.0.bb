SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "d564acc365839f6b381864024c89843f"
SRC_URI[sha256sum] = "cd648c0343e41cb93fcd1db63dbe25e24ba623b79fbd42b9e275755b586865ce"

GEM_NAME = "faraday-net_http"

inherit rubygems
