SUMMARY = "RubyGem: aws-sdk-costandusagereportservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Cost and Usage Report Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "51044be98195a0b3cfa5231dedba08e5"
SRC_URI[sha256sum] = "237cf9ece5cc32cd819070b46505b6209a1b43263c9f69529682b43e070085ea"

GEM_NAME = "aws-sdk-costandusagereportservice"

inherit rubygems
