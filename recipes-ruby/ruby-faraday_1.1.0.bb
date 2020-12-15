SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-multipart-post \
                  ruby-ruby2-keywords"

SRC_URI[md5sum] = "3aa804b7e4ff01a8cee276510bb9182a"
SRC_URI[sha256sum] = "6578c3ca23d2f63abf436031ca89b47ffe2c7b0d7952928ba079c75b22bfaa99"

GEM_NAME = "faraday"

inherit rubygems
