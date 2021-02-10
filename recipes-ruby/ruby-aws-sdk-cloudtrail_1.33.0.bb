SUMMARY = "RubyGem: aws-sdk-cloudtrail"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudTrail (CloudTrail)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "860e21fe81d4c5f46b95794043c4f67f"
SRC_URI[sha256sum] = "8f87a2e4a2603417338e3332d0677a313e4a3a6d995770457674221d52a37620"

GEM_NAME = "aws-sdk-cloudtrail"

inherit rubygems
