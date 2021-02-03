SUMMARY = "RubyGem: aws-sdk-cloudwatchlogs"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Logs"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c6673d94e940e1e83d169cdc0ce979ef"
SRC_URI[sha256sum] = "1e59a9ff33128f9eb0d4975cf05f39d9f9d80bf96780a7d434085d2b7bde2a2b"

GEM_NAME = "aws-sdk-cloudwatchlogs"

inherit rubygems
