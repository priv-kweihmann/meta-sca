SUMMARY = "RubyGem: aws-sdk-shield"
DESCRIPTION = "Official AWS Ruby gem for AWS Shield"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "042c94f6eabc90db1d1fc8a3ffbca930"
SRC_URI[sha256sum] = "3652358aaf28a2605c8165f4fadc3d30fa072a4a66f13818b4ee24e457ae2610"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
