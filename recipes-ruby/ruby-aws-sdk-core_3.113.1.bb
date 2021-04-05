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

SRC_URI[md5sum] = "993d24b4f2d419d5c8fed220f15a190e"
SRC_URI[sha256sum] = "e0fd125f6ace260217d3b98a6baa3fb0e66a142b7f36d6ce498955ffd2457d44"

GEM_NAME = "aws-sdk-core"

inherit rubygems
