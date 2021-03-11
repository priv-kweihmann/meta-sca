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

SRC_URI[md5sum] = "f74f9df3859e61fbb7dbfee0c126aaa9"
SRC_URI[sha256sum] = "3f49f4e8eec6c62e4936a7e0a654dcd92b4452006e5f5be0c6070c879defe49c"

GEM_NAME = "aws-sdk-core"

inherit rubygems
