SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "51cff6ae487f68a44518cd067e4281cd"
SRC_URI[sha256sum] = "346d6dfef227df7091ac9b1073fdd735c6cec1f110f156efebf67c03f9b4fbb0"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
