SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-faraday-excon \
                  ruby-faraday-net-http \
                  ruby-faraday-net-http-persistent \
                  ruby-multipart-post \
                  ruby-ruby2-keywords"

SRC_URI[md5sum] = "a0c066a79d7c6481a611fb912c19eb76"
SRC_URI[sha256sum] = "fe2839a291686c28e5d3ba54f1d8e0e29500dea33eec203750ee8bd34982abf2"

GEM_NAME = "faraday"

inherit rubygems
