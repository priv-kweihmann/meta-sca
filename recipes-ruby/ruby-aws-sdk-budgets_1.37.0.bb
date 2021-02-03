SUMMARY = "RubyGem: aws-sdk-budgets"
DESCRIPTION = "Official AWS Ruby gem for AWS Budgets (AWSBudgets)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e3185df740115be15f9c80b14f32d761"
SRC_URI[sha256sum] = "825c6f47c424816ca4967c8e27785dc63ab4fb600e86fdadca5496eb12a8a752"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
