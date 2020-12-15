SUMMARY = "RubyGem: aws-sdk-cloudwatch"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch (CloudWatch)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5f839ad4e4ffb49bcb8a8b88c02868da"
SRC_URI[sha256sum] = "77726765ad1001380ad3c9094fb51c84d5a9d6f01ff84e03ee426d07f53cc4b5"

GEM_NAME = "aws-sdk-cloudwatch"

inherit rubygems
