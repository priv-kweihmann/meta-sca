SUMMARY = "RubyGem: aws-sdk-sqs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Queue Service (Amazon SQS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5a0e751da4fb2ac0b5738fa7f0fa7bc9"
SRC_URI[sha256sum] = "9840bb4e3024edae5fdd28b5560395dc39e6e44081147fb270bc5d3cb9420f1f"

GEM_NAME = "aws-sdk-sqs"

inherit rubygems
