SUMMARY = "RubyGem: aws-sdk-route53domains"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Domains"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d1d76be8d2359e3b925d5fdba1c21493"
SRC_URI[sha256sum] = "785f3088c117b789cbbeaab01040867972ab42e343a62d89fe5381462faf10e8"

GEM_NAME = "aws-sdk-route53domains"

inherit rubygems
