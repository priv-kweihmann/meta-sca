SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e50b602f0ccbecdd1260fdc7108a4280"
SRC_URI[sha256sum] = "f851f71cd9368ee1f6b70c99bf1418a8caa0b10a29ca9304e3c7e7d1fc6d4328"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
