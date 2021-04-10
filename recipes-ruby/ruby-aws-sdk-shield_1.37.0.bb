SUMMARY = "RubyGem: aws-sdk-shield"
DESCRIPTION = "Official AWS Ruby gem for AWS Shield"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "592480ff8b53db3da0413e0a4b6c8bb0"
SRC_URI[sha256sum] = "41c05d5453e7de5747ade66bafac596fcfe1941362224b3d827a476c052476dc"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
