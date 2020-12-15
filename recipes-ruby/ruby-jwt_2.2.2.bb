SUMMARY = "RubyGem: jwt"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) standard."
HOMEPAGE = "https://github.com/jwt/ruby-jwt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c5ddc412bf0298cd997114a6c994c5"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "33d01d792216c68b0f964aed0858635c"
SRC_URI[sha256sum] = "56a47115e514b9cfba93b8067332462a74ecbcea843a0784bc7a208203f6d693"

GEM_NAME = "jwt"

inherit rubygems
