SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-eventstream \
                  ruby-aws-partitions \
                  ruby-aws-sigv4 \
                  ruby-jmespath"

SRC_URI[md5sum] = "ab921dc50a05ed758335554aed9c6593"
SRC_URI[sha256sum] = "89b721d1431b4cf5dfd2d578e3cb38083163ce0fb265b2d87125c196d63dae64"

GEM_NAME = "aws-sdk-core"

inherit rubygems
