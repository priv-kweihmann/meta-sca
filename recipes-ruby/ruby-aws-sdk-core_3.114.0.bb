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

SRC_URI[md5sum] = "a53e675090a4d274fd7f7db922e66db6"
SRC_URI[sha256sum] = "4c8ebfa9078d9e4abe12a2e3004dc81c92a921d03343826731819af4585b5a25"

GEM_NAME = "aws-sdk-core"

inherit rubygems
