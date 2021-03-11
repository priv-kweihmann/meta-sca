SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c5fc7c3d7557281fce95ff25bb2935a0"
SRC_URI[sha256sum] = "eef479c2fb81d7587e82d02bbe1452bec958dcd6f1ca3a080d89e0dfc38ed2b5"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
