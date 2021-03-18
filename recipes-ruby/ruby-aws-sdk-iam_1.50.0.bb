SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b776b827eeb4550655b092889cdafbfa"
SRC_URI[sha256sum] = "145b8e7a2c40437197e84ac7f2ca1600f772fa9ba4179ef81878186cc43dcc10"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
