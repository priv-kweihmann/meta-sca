SUMMARY = "RubyGem: docker-api"
DESCRIPTION = "A simple REST client for the Docker Remote API"
HOMEPAGE = "https://github.com/swipely/docker-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f51ac9a2b4f16c3b23be5ed53a958aa"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-excon \
                  ruby-multi-json"

SRC_URI[md5sum] = "04c04abbda9ab6b8e12276110d6b634e"
SRC_URI[sha256sum] = "89a98478fb36f0aa6ecfdf382b55eceed35f40bb134d07d447250c6a41619326"

GEM_NAME = "docker-api"

inherit rubygems
