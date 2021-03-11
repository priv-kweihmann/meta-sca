SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f92a36c165964bd048921d01c07c2946"
SRC_URI[sha256sum] = "f6b9a460dc6247c618dabb942df401dce7a5aa4a2b480c0b571eb39f32d2eee8"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
