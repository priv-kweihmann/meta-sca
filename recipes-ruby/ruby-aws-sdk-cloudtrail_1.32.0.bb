SUMMARY = "RubyGem: aws-sdk-cloudtrail"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudTrail (CloudTrail)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "965e587af7f95c035673146eab23c8c0"
SRC_URI[sha256sum] = "825810d4412b6493e2be9a829fbed820a12bbf7d38824af80ad3b13bbbd1be51"

GEM_NAME = "aws-sdk-cloudtrail"

inherit rubygems
