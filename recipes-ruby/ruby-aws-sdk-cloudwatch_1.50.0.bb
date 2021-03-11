SUMMARY = "RubyGem: aws-sdk-cloudwatch"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch (CloudWatch)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4762da6bcbde6b038826028318c0157b"
SRC_URI[sha256sum] = "0ce46e9a34c294478fa054dfb470036046a5c838ee8b4bfe73b988641b00ea75"

GEM_NAME = "aws-sdk-cloudwatch"

inherit rubygems
