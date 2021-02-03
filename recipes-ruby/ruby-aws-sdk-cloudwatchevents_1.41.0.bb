SUMMARY = "RubyGem: aws-sdk-cloudwatchevents"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Events"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "542461ac9a87bf18fb3ea365b3afb5d9"
SRC_URI[sha256sum] = "1d47567053d8c40783d22db0624310a3966d7b9507b057e1fe774335abac2dc5"

GEM_NAME = "aws-sdk-cloudwatchevents"

inherit rubygems
