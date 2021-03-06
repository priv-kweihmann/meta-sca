SUMMARY = "RubyGem: aws-sdk-shield"
DESCRIPTION = "Official AWS Ruby gem for AWS Shield"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c80b00fe019023caeacdb74ffdf60a36"
SRC_URI[sha256sum] = "370116446b39b270e50e69e8d2e89bb4804e5f7b12d1a823a6f8c324db2bc6cd"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
