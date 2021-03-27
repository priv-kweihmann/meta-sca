SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "190f973a71b9ad743db3ead86f074004"
SRC_URI[sha256sum] = "6d1929e0cacf15e8d75c3b9d9cbe9d38237891b03a1b15e109455200b641e1ea"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
