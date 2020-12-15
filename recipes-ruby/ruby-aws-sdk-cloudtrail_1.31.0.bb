SUMMARY = "RubyGem: aws-sdk-cloudtrail"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudTrail (CloudTrail)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b2340a69b331119697a4eb89bcb0942a"
SRC_URI[sha256sum] = "da54249a6a3c32fa49ce0b7b8ba4ad2263605322c80cf830bcb39a541d2bdb4b"

GEM_NAME = "aws-sdk-cloudtrail"

inherit rubygems
