SUMMARY = "RubyGem: aws-sdk-sqs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Queue Service (Amazon SQS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "245814e123abf05157aad7d59440d2e5"
SRC_URI[sha256sum] = "2e42127c10908dc6e59c49d73c8917bd5618435c858343b7ecd1114c3ca2a206"

GEM_NAME = "aws-sdk-sqs"

inherit rubygems
