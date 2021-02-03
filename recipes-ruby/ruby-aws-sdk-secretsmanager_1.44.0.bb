SUMMARY = "RubyGem: aws-sdk-secretsmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Secrets Manager"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "072056cee4971a8f9b89bdec1cb14c76"
SRC_URI[sha256sum] = "64b4bf08b96c0491406227880945c2ff3d8f73fbf851e65d96d5cdc6511029e0"

GEM_NAME = "aws-sdk-secretsmanager"

inherit rubygems
