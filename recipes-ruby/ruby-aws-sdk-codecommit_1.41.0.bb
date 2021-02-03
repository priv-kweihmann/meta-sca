SUMMARY = "RubyGem: aws-sdk-codecommit"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeCommit (CodeCommit)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "bb34037129ac136eeb3674a7c7f4e883"
SRC_URI[sha256sum] = "02cb9263874760d9664a915e88a530f3591286cdcbf740e95408cee1285e61b1"

GEM_NAME = "aws-sdk-codecommit"

inherit rubygems
