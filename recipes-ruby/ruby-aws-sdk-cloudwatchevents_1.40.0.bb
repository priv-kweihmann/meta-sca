SUMMARY = "RubyGem: aws-sdk-cloudwatchevents"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Events"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "442ae7b48545bd9ec7ca9d67ab12c4fe"
SRC_URI[sha256sum] = "7e182410019e359af1df331f3f3a65c9444b05c0aabc0b8c11bd58bf3ef21092"

GEM_NAME = "aws-sdk-cloudwatchevents"

inherit rubygems
