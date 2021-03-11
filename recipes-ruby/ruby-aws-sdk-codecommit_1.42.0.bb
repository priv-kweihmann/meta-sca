SUMMARY = "RubyGem: aws-sdk-codecommit"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeCommit (CodeCommit)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d6010fcaf3d9406073a8e507850e64d1"
SRC_URI[sha256sum] = "d0fed017872442c244a5327d38bdc47627976e621048fc91e0296d2b9fc7e901"

GEM_NAME = "aws-sdk-codecommit"

inherit rubygems
