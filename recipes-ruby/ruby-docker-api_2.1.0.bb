SUMMARY = "RubyGem: docker-api"
DESCRIPTION = "A simple REST client for the Docker Remote API"
HOMEPAGE = "https://github.com/swipely/docker-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f51ac9a2b4f16c3b23be5ed53a958aa"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-excon \
                  ruby-multi-json"

SRC_URI[md5sum] = "ab260641c4981f44e48dbb3d9f030f42"
SRC_URI[sha256sum] = "1989a3b52f42ad64e7495c01843b0a7f5784c15f427638975ba7ffd4f6d5092c"

GEM_NAME = "docker-api"

inherit rubygems
